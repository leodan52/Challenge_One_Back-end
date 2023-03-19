# Conversor de Monedas | Challenge ONE Back-end - Java

![entrepreneur-g25e9f1667_1280](https://user-images.githubusercontent.com/109176490/225792783-a5ce2895-1efd-4ea3-b01a-28a9f128101e.jpg)

Segundo Challenge del curso ONE (Oracle Next Education) impartido por Alura Latam, para la formación Back-end en lenguaje Java. Como estudiante perteneciente al Grupo 4, me toca presentar un Conversor de divisas. Adicionalmente, como un EXTRA en el reto, se incluye un conversor de temperaturas.

## Requisitos

Este proyecto está desarrollado con JavaSE 11.0.18, por lo que es necesario tener una versión de Java igual o mayor para ejecutar el programa. Para conocer la versión de Java instalada en su sistema, ingrese en el Símbolo del Sistema en Windows, o en cualquier terminal el siguiente comando

>~~~
> java --version
>~~~

### Instalación en Windows

Siga esta liga para descargar la versión 11 del JDK: https://www.oracle.com/co/java/technologies/downloads/#java11-windows

### Instalación en Linux

Usted puede instalar la versión 11 del JDK haciendo click en la siguiente liga: https://www.oracle.com/co/java/technologies/downloads/#java11-linux

Sin embargo, si usa Ubuntu o una distribución derivada, puede optar por una versión alternativa del JVM desde los repositorios usando el siguiente comando

>~~~
> sudo apt-get install openjdk-11-jre
>~~~

Se incluye un ejecutable JAR, `conversor.jar`, para probar la aplicación sin depender de una IDE.

## Funcionamiento

Al ejecutar el proyecto lo primero que se desplegará será una ventana con un menú para elegir el conversor que se desea utilizar. Cuenta con solo dos opciones: el Conversor de Divisas del Challenge principal, y el Conversor de Temperaturas que funge como extra.

![vokoscreen-2023-03-16_19-40-15_AdobeExpress](https://user-images.githubusercontent.com/109176490/225792828-7a46ef55-ccb2-4e70-a97b-e4f5df4c6eb9.gif)

El usuario podría elegir entre cualquiera de los dos, y consiguientemente se abrirá la correspondiente ventana.

### Conversor de divisas

Este programa puede convertir entre seis diferentes divisas: *Peso mexicano (MXN)*, *Dólar estadounidense (USD)*, *Euro (EUR)*, *Libra esterlina (GBP)*, *Yen japonés (JPY)* y *Won coreano (KRW)*. Las tasas de cambio se obtienen mediante la API [Exchange Rates Data API](https://apilayer.com/marketplace/exchangerates_data-api). El funcionamiento interno consiste en obtener las equivalencias con respecto al dólar estadounidense, y mediante fórmulas obtener otras tasas.

![gif2](https://user-images.githubusercontent.com/109176490/225793203-9c7a6fa4-e989-40bf-9229-f60a866b8d3e.gif)

Las pruebas anteriores se realizaron con las tasas de cambio del día 16 de marzo del 2023.

### Conversor de Temperatura

Como agregado al proyecto, decidí incluir un conversor de Temperatura. Como se mostrará más adelante, el diseño tiene un formato diferente al Conversor de divisas. La conversión se hace en tiempo real mientras el usuario ingresa la cantidad a convertir. Las conversiones se realizan entre las unidades de temperatura más usadas en el mundo, Celsius[^1], Fahrenheit[^2] y Kelvin[^3], así como una unidad extra menos conocida llamada Rankine[^4].

[^1]: Para más información visite https://es.wikipedia.org/wiki/Grado_Celsius
[^2]: Para más información visite https://es.wikipedia.org/wiki/Grado_Fahrenheit
[^3]: Para más información visite https://es.wikipedia.org/wiki/Kelvin
[^4]: Para más información visite https://en.wikipedia.org/wiki/Rankine_scale

![gif3](https://user-images.githubusercontent.com/109176490/225793302-04e5eeaa-f589-4fa0-99b9-4b7e6ad9d3cd.gif)

Como se muestra en la figura anterior, el programa admite valores numéricos para la realización de las conversiones, pero si se ingresa un valor diferente, muestra un mensaje de error en los campos correspondientes.

## Construido con

La construcción del programa se realizó con JavaSE 11 ya que se utilizó el método nativo `http` para la comunicación con la API. Así mismo se usó una librería externa más:

* [json-simple](https://code.google.com/archive/p/json-simple/) Para el manejo de String con formato JSON
* miglayout15-swing

Estas librerías están en la carpeta `lib/` listas para importar y ejecutar el proyecto en su IDE favorito.

## Información del autor

Mi nombre es Leonardo D. Santiago García, y me estoy esforzando mucho para lograr construir una carrera en el área de la tecnología. Más información sobre mí en [LinkedIn](https://www.linkedin.com/in/leodansantiago/).

## Agradecimientos

* Programa [ONE - Oracle Next Education](https://www.oracle.com/mx/education/oracle-next-education/)
* [Alura Latam](https://www.aluracursos.com/)
* Y a todos los instructores que acompañan al grupo 4 durante nuestra formación.
