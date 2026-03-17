# Anotaciones en Spring Boot

Las **anotaciones** sirven para **configurar** y **definir el comportamiento** de componentes de una aplicación.

## Se definen así

`@` + nombre de la anotación + atributos opcionales

Ejemplo:

```java
@GetMapping("/clientes")
```
# Anotaciones en Spring Boot

## `@SpringBootApplication`
Anotación que marca la **clase principal** de una aplicación Spring Boot.

---

## `@RestController`
Controla las peticiones **HTTP** y devuelve **datos** en la respuesta, normalmente:

- JSON
- XML
- texto

**Diferencia:**
- `@RestController` → devuelve **datos**
- `@Controller` → devuelve **vistas HTML**

---

## `@GetMapping`
Cuando llega una **petición HTTP GET**, se ejecuta ese método y devuelve una respuesta.

**Definición pro:**  
`@GetMapping` mapea una petición HTTP GET a un método del controller.

**GET** = obtener / consultar datos

También puede tener **varias rutas**:

```java
@GetMapping({"/hola", "/x", "/z"})


@RestController
public class HolaController {

    @GetMapping("/hola") // si alguien entra a esta ruta, se ejecuta este método
    public String saludar() {
        return "Hola";
    }
}
```

Get: obtener

Post: Crear

@PostMapping: Cuando llegue la peticion http post, ejecuta esto, previamente debe haber un RequestMapping o un GetMapping

requestMapping: estableces la direccion base
```java
@RequestMapping("/usuarios")
```

GetMapping: si hace un get aqui, ejecutar esto
```java
@GetMapping("/listar")
public String listar() {
    return "lista";
}
```
