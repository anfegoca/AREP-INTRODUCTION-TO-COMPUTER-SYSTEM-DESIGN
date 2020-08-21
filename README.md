# Mean and Standad Desviation
[![anfegoca](https://circleci.com/gh/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN.svg?style=svg)](https://app.circleci.com/pipelines/github/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN)


Este programa ofrece el servicio de calcular la media y la desviación estándar desde una página web.

## Getting Started

Para hacer uso del proyecto podemos entrar a la siguiente dirección:  
\
https://cryptic-lowlands-26103.herokuapp.com/inputdata   
\
o solo debe clonar el repositorio o descargarlo directamente, para ejectarlo lo hacemos por medio de la consola usando el siguiente comando, para compilar las clases con maven

```bash
mvn package
```
Luego ejecutamos el programa usando el siguiente codigo:

Linux o Mac
```linux
java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.App.SparkWebApp
```
Windows
```windows
java -cp target/classes;target/dependency/* edu.escuelaing.arep.App.SparkWebApp
```

luego abrimos la siguiente pagina: http://localhost:4567/inputdata, nos aparecerá la siguiente página, donde tendremos que ingresar los datos a los cuales les queremos realizar los cálculos, los datos se deben ingresar separados por coma

![direc](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/4.png)

Una vez ingresemos los datos le damos al botón de submit y nos mostrará el resultado

![direc](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/7.png)


### Prerequisites

Para usar el proyecto se necesitan tener las siguientes versiones de java o superior:


```
java version "1.8"
javac version "1.8"
Apache Maven 3.6.3
```

### Installing

Para usar el proyecto decargamos directamente el proyecto o lo clonamos de la siguiente manera:

En la consola nos vamos al directorio donde vamos a clonar el repositorio y ponemos el siguiente comando:

```bash
git clone https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN.git

```
![clone](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/1.png)

En el direcctorio nos quedará la carpeta del proyecto y dentro veremos las siguiente carpetas

![direc](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/2.png)

Para modificar abrimos el proyecto con cualquier editor, en este caso usamos Visual Studio Code

![edit](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/3.png)

Y ya podemos modificar cualquier clase del proyecto

![class](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/5.png)

## Running the tests

Para ejecutar los test del proyecto usamos el siguiente codigo desde la ruta del proyecto

```bash
mvn test

```
![test](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/6.png)



## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

El versionamiento se realizó a través de [github](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN.git)

## Authors

* **Andrés González** - [anfegoca](https://github.com/anfegoca)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.txt) file for details

## Design

Para mas información del diseño del proyecto puede ver el siguiente [documento](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/blob/master/resources/Mean%20and%20Standard%20Deviation.pdf)

## JavaDoc

La documentación del proyecto la puede encontrar [aquí](https://github.com/anfegoca/AREP-INTRODUCTION-TO-COMPUTER-SYSTEM-DESIGN/tree/master/site/apidocs)
o puede usar el siguiente comando para generarla

```bash
mvn javadoc:javadoc

```



