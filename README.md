# Programación orientada a objetos POO or Object Orientent Programing  OOP

- Analizar un problemaa en forma de objetos para posteriormente llevarlo  una solución de código

- Paradigma: teoría que suministra la base y modelo para resolver un problema.

1. clases

2. Propiedades

3. Métodos

4. Objetos


	- Enapsulamiento
	
	- Abstracción
	
	- Herencia
	
	- Polimorfismo
	

UML inified Modeling Language

OMT  Object Modeling Techniques "deplecate"


						OBJETOS

Cuando tengamos un problema lo primero que debemos hacer es identificar los **objetos**. 

	- Los objetos tendran **comportamientos** y acciones, pueden ser vervos o sustantivos
	- **propiedades** (atributos), siempre son sustantivos
	- pueden ser fisicos(user) o conseptueles(session)

						CLASES
						
Es el modelo (molde) sobre el cual se construirá nuestros objetos.

	- Creamos las clases y abstraemos los datos para generar un molde.
	- Las clases se separan en archivos difeentes
 

						MODULARIDAD
						
Subdividir un sistema en modulos (partes más pequeñas), para segmentar el comportamiento y resultado de cada segemento de coódigo.

	+ Reutilizar
	+ Evitar colapsos completos
	+ Mantenible
	+ Legibilidad
	+ Resolución rapida de problemas

## UML sintax

Nombre de la clase    ---->     Identidad

Atributo 1            
Atributo 2            ---->     Estado
Atributo 3

Operación 1
Operación 2           ---->     Comportamiento
Operación 3


-- Objeto "persona" a diagrama UML

			Person
			name
			walk()
			
			
- Clases en diferentes lenguajes

Java
class Person{}

PHP
class Person{}

Python 
class Person:

JS
function Person(){}


- Clases 

~~~Java
/* Java */
class Person{
    String name="";
    void walk(){}
}
~~~

~~~PHP
/* PHP */
class Person{
    $name="";
    function walk(){}
}
~~~


~~~Python
""" Python """
class Person:
name="str";
def walk():
~~~

~~~JavaScript
/* JavaScript */
Person.prototype.walk = Creo(){
	
}

~~~


> DRY: Don't repeat yourself: promueve reducir la rendundancia en el código, en el cual ninguna pieza de información debería ser duplicada debido a su dificultad de mantenimiento



## Herencia

Se crearán nuevas clases a partir de otras. Reutilizar líneas de código.

```

			Súperclase
				|
	____________|___________	
	|			|			|
	v			v			va
Subclase1	Subclase2	Subclase3

```

## Declarar objeto e instanciando utilizando la estructura de las clses declaradas.


~~~
Java
Person person = new Person();

PHP
$person = new Person();

Python 
persona = Person()

JS
var person = new Person();
~~~



### Metodos contructores

Aportan de un estado inicial y sus paremetros a un objeto instanciado

~~~java
/* Java */
public Person(String name){
	this.name = name;
}
~~~

~~~PHP
<?php

public function__construct($name){
	$this->name = name;
}
~~~

~~~Python
""" Python  """
def__init__(self, name):
	self.name = name
~~~

~~~JavaScript
/* JS */

function Person(name){
	this.name = name
}

~~~









# UBER


| USER | DRIVER |
| -- | -- |
| id | id |
| name | name |
| credictCart | credictCart |
| email |
| password |


| USER |
| -- |
| id |
| name |
| credictCart |
| email |
| password |

| DRIVER |
| -- |
| id |
| name |
| driverLicense |
| email |
| password |

| ROUTE |
| -- |
| id |
| start: [ ] |
| end : [ ] |

| uberPool |
| -- |
| id |
| license |
| driver |
| passergers |
| brand |
| model |

| uberbBlack |
| -- |
| id |
| license |
| driver |
| passergers |
| typeCardAccepted : [ ] |
| seatsmaterial : [ ] |


| uberbVan |
| -- |
| id |
| license |
| driver |
| passergers |
| typeCardAccepted : [ ] |
| seatsmaterial : [ ] |

| CARD |
| -- |
| id |
| number |
| cvv |
| date |

| PAYPAL |
| -- |
| id |
| email |

| CASH |
| -- |
| id |




## MASCOTAS

Flujo de dopción de mascotas en "PET global adoption app"  

1. nececidad de un ususario de una mascota
2. ingreso a aplicación de adopción según tu ubicación
3. exploración de opciones (especie), cercania y requerimientos (clases, molde)
4. revisión de documentación veterinaria
5. ubicación de centro de adopción
6. elección de tipo de entrega
7. elección de metodo de pago 
8. recepción de mascota y un kit de adoption is great

		- mascota

		- centro de adopción

		- usuario

		- documentación veterinaria

		- coste
		
		_ adopción

		_ tipo de entrega

		_ metodo de pago

		_ entrega



	
























































:: que sistematisar un ecosistema (laboral) en base a los imperativos morales del super yo, los cuales no invalido, sin embargo se maneja en la inmediatez y el inconsiente donde la dificultad de recuperar material de lo que esta muy por debajo de la superficie de la conciencia, como la eficiencia y salud emocional, la construcción de pertenencia a una institución de impacto social y personal hacia nuestras familias, donde debiesemos de ligar nuestra estado de bienestar con la correlación en el desarrollo de habilidades que permitan diversificar y/o amplición del poder adquisitivo y sobre esto vernos beneficiados (y a nuestras familias), y que de nuevo se entraría en el supuesto, en el deber ser y el romantisismo de la ideologia, mas sin embargo alguien tiene que por lo menos señalizar esto, para dejar de hacer lo inmediatamente rentable y comenzar a hacer lo estrategicamente correcto.


:: Todo lo que el individuo enajena de su poder adquisitivo, es solamente la parte cuyo uso tranciende para la comunidad, donde las institusiones soberanas y, el constructo social, son las responsables de dar este parametro(especulación de mercado).

::una empresa que se toma en cuenta a sus clientes, es una empresa que utiliza la información para obtener una ventaja competitiva y alcanzar el crecimiento y la rentabilidad.



1. Modelo o diagrama UML
2. Objetos
3. Abstracción
4. Clases
5. Modularidad
6. Herencia
7. objetos, metodo constructor 
8. instanciando clases*
9. declarar metodo
10. 