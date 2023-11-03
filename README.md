# TiposDeHerencia
Ejercicio sobre los tipos de herencia usando la metodología explicada en clase
<hi>01 MAPPED SUPERCLASS</h1>
Aunque en el programa tengamos la clase padre de la que heredan otras, esa clase padre base no se va a trasladar a la base de datos, con la anotación @MappedSuperClass indicamos que vamos a tener una herencia 
Como se van a crear dos tablas diferentes por lo que no permiten consultas polimórficas, las dos tablas que heredan van a ser independientes 


<h1>03 JOINED</h1>
<p>Se requiere en la clase padre una una anotacion de Inheritance y añadirle el tipo JOINED</p>
<img src="https://github.com/Crenstonw/TiposDeHerencia/assets/119967718/14d1bd9a-2e70-4473-ad76-842bcd788825">
<p>Y en la clase hija se debe hacer un extends, crear un constructor en el que el cuerpo del hijo sean los atributos del padre MÁS los atributos suyos</p>
<img src="https://github.com/Crenstonw/TiposDeHerencia/assets/119967718/d1716096-06f2-447a-abfb-1f8afc08b0ba">

<h1>04 Single Table</h1>
<p>Single table asigna todas las entidades de la estructura de herencia a la misma tabla de base de datos. Este enfoque hace que las consultas polimórficas sean muy eficientes y proporciona el mejor rendimiento.</p>
<p>Cuando persistes todas las entidades en la misma tabla, Hibernate necesita una forma de determinar la clase de entidad que representa cada registro. Esta información se almacena en una columna discriminadora que no es un atributo de entidad. Puede definir el nombre de la columna con una anotación @DiscriminatorColumn en la superclase o Hibernate usará DTYPE como su nombre predeterminado.</p>
<p>La definición de las subclases es nuevamente similar a la de los ejemplos anteriores. Pero esta vez, también debes proporcionar una anotación @DiscriminatorValue . Especifica el valor del discriminador para esta clase de entidad específica para que su proveedor de persistencia pueda asignar cada registro de la base de datos a una clase de entidad concreta.
La anotación @DiscriminatorValue es opcional si usa Hibernate. Si no proporciona un valor discriminador, Hibernate utilizará el nombre de entidad simple de forma predeterminada. Pero este manejo predeterminado no está definido por la especificación JPA y no debes confiar en él.</p>
De la siguiente forma 

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/bb4ae2ab-5983-458e-b61c-a0ca4728cdb9)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/9aab27ff-2181-4359-bb9e-32a7453481c1)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/dcb9e0ff-8e1a-4dcf-a82b-92cf31bf6a34)

Los servicios deben ser de la siguiente forma 

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/ea3b2658-03da-4699-8dfe-868482e0749d)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/553500f2-1f98-429d-9f9e-e0d3dba75568)


![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/3614760f-017f-4895-ad75-76e638287bcc)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/4149d67b-5bd0-4eda-a81d-9987881bb33e)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/eabf27d8-1bd7-4a3b-80c0-46ab3be325be)

Y los repositorios extienden del repo base
![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/8731c73a-495d-43d8-a14e-854a933dec31)

![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/a93d14b2-506e-47ad-8ff7-ee24fc30955d)


![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/2206b873-4c46-4b1d-bfd5-255ba9927216)

El cual con un init data quedaría la base de datos de la siguiente forma,


![image](https://github.com/Crenstonw/TiposDeHerencia/assets/113030967/77d0d836-4a51-4e02-ac49-21c910d14b60)

