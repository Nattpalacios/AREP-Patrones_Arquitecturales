# Patrones Arquitecturales

## Autor

Natalia Faride Palacios Rozo

## Desplegar un sitio estático usando S3

Vamos a aprender a desplegar un sitio estático usando S3 en AWS en unos pasos muy sencillos. Para poder hacer esto, es importante que tengamos una cuenta en AWS o AWS Educate.

1. Lo primero que haremos es abrir la consola de AWS.
2. Seleccionamos S3 en la sección ‘Storage’.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/1.png)

3. Le damos clic en Crear bucket.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/2.png)

4. Le asignamos un nombre al bucket, en este caso yo le pondré ‘nattbucket’. Damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/3.png)

5. En este paso no es necesario hacer algo, sencillamente le damos en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/4.png)

6. Desactivamos esa opción para poder dar acceso público y damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/5.png)

7. Damos clic en Crear bucket.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/6.png)

8. Una vez creado el bucket debe aparecernos algo así:
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/7.png)

9. Entramos al bucket que creamos dando clic sobre él y damos clic en Upload para subir nuestro archivo estático, en este caso yo subiré un archivo de tipo html.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/8.png)

10. Damos clic en 'Add Files' y seleccionamos nuestro archivo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/9.png)

11. Una vez seleccionado el archivo que queremos subir, damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/10.png)

12. En este paso no debemos cambiar nada, solo damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/11.png)

13. Lo dejamos con ese y damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/12.png)

14. Damos clic en Upload para cargar el archivo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/13.png)

15. Una vez subido el archivo, debe aparecernos algo así. Damos clic sobre él para poder verlo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/14.png)

16. Damos clic en el link donde se desplegó.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/15.png)

17. Es posible que nos aparezca esto, así que nos devolvemos a donde estábamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/16.png)

18. Vamos a la pestaña 'Permissions' y en Public access seleccionamos Everyone.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/17.png)

19. Nos debe aparecer este recuadro y habilitamos Read Object para que al abrir el enlace nos muestre nuestro archivo. Damos clic en Save. Una vez hecho esto, volvemos a la pestaña Overview y volvemos a abrir el enlace. Ya debería funcionar. Eso es todo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/ImagenesPuntoUno/18.png)

## Video

Para ver el video del tutorial:
- https://github.com/Nattpalacios/AREP-Patrones_Arquitecturales/blob/master/Videos/S3-Archivo%20estatico.mp4

## Desplegar un recurso dinámico en EC2 con una base de datos

Ahora vamos a aprender a desplegar un recurso dinámico en el servicio EC2 de AWS haciendo uso de una base de datos también creada en AWS. Para poder hacer esto, es importante que tengamos una cuenta en AWS o AWS Educate y además que tengamos instalado DBeaver. Antes de empezar, ingresamos a nuestra cuenta de AWS o AWS Educate y abrimos la consola.

1. Una vez dentro de la consola, buscamos VPC, el cual nos ayudará a abrir los puertos para poder conectarnos a la base de datos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/1.png)

2. Ya dentro de VPC, nos vamos a la sección Security y damos clic en Security Groups, como se señala en la imagen.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/2.png)

3. Vamos a crear un grupo de seguridad, así que damos clic en Create security group en la parte superior.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/3.png)

4. Le asignamos un nombre, ponemos una descripción y le asignamos el VPC que aparece por defecto. Damos clic en Create.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/4.png)

5. Una vez creado el grupo de seguridad, lo seleccionamos, en la parte inferior vamos a la pestaña 'Inbound Rules' y damos clic en 'Edit rules'.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/8.png)

6. Damos clic en 'Add Rule' y lo ponemos así: En la sección 'Type' seleccionamos MySQL/Aurora, en la sección 'Source' seleccionamos Anywhere. Damos clic en Save rules.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/10.png)

7. En la parte superior izquierda de la pantalla damos clic en la pestaña que dice 'Servicios', y buscamos la sección 'Bases de datos' y seleccionamos RDS.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/13.png)

8. Damos clic en Create database.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/14.png)

9. Aquí seleccionamos Standard create y MySQL, ya que es con esa que trabajaremos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/16.PNG)

10. En la sección 'Templates' seleccionamos Free tier.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/17.PNG)

11. En este punto, debemos asignarle los datos a la base, en Master Username podemos dejarle 'admin' y en los otros campos le ponemos una contraseña.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/18.PNG)

12. En la sección Conectivity, vamos a dejar que sea de acceso público, así que en 'Publicly accessible' ponemos Yes. En VPC Security group seleccionamos la opcipon de una existente, y vamos a buscar la que creamos anteriormente.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/20.PNG)

13. En este punto asignamos un nombre a la base de datos y listo, la creamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/21.PNG)

14. Una vez creada la base de datos debe aparecernos algo así. Esperamos a que en la pestaña 'Status' diga Available y entramos a la base de datos dando clic sobre el nombre.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/23.PNG)

15. En la parte inferior de la pantalla en 'End point' nos aparece el host para conectarnos a la base de datos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/24.PNG)

16. Ahora, abrimos DBeaver y vamos a conectarnos a la base de datos. Damos clic en lo que está encerrado con el recuadro rojo y selecciona MySQL. Damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/26.PNG)

17. En el campo del host, ponemos el que vimos en el punto 15, en Database ponemos el nombre que asignamos en el punto 13 y en User name y en Password ponemos los datos que asignamos en el punto 11. Damos clic en 'Test connection' para asegurarnos de que pusimos bien los datos y luego 'Finish'.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/27.PNG)

18. Una vez conectados a la base de datos, damos clic en la opción que está encerrada en el recuadro rojo y seleccionamos nuestra base de datos. 
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/30.PNG)

19. Aquí lo que haremos es crear una tabla para nuestra API y vamos a meterle datos para probar que funciona.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/31.PNG)

20. Al correrla y refrescar, debería aparecernos nuestra tabla y los datos que introdujimos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/32.PNG)

21. En este punto lo que hacemos es correr nuestra API localmente y debería aparecernos algo así, con los datos que le metimos a la base de datos.

![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/33.PNG)

22. Ahora vamos a desplegar la API con EC2. Para ello, en la consola de AWS seleccionamos el servicio EC2 en la sección 'Compute'.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/34.PNG)

23. Damos clic en Launch Instance.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/35.PNG)

24. Seleccionamos la segunda opción.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/36.png)

25. Dejamos esa y damos clic en Next hasta el paso 6.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/37.png)

26. En este paso damos clic en 'Add rule'. En la pestaña Type seleccionamos Custom TCP, en el puerto ponemos 8080 y en Source ponemos Anywhere. Damos clic en Review and Launch.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/41.png)

27. Aquí vamos a crear una key pair, así que le decimos Create a new key pair, le ponemos un nombre, la descargamos y la guardamos en nuestro proyecto.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/42.png)

28. Listo, una vez creada la instancia debe aparecernos algo así y damos clic en Connect.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/44.png)

27. Al dar clic en Connect nos aparecen los pasos para conectarnos remotamente a la máquina virtual, la instancia antes creada.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/45.png)

28. Vamos a la terminal y nos paramos donde guardamos nuestra key pair y escribimos los comandos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/46.png)

29. Una vez dentro de la máquina virtual, utilizamos estos dos comandos para desinstalar java 1.7 e instalar java 1.8.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/50.PNG)

30. En este paso escribimos 'mvn package' para empaquetar nuestro proyecto. Ahora escribimos el mismo comando de ssh, pero cambiando ssh por sftp pues debemos subir nuestro jar a la máquina virtual.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/47.png)

31. Cuando ya subimos nuestro jar a la máquina, volvemos a escribir el comando de ssh.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/48.png)

32. En el paso 27 nos dan el link con el que podemos conectarnos a la máquina virtual, lo ponemos y le agregamos ':8080/estudiantes', donde estudiantes es el nombre que le hayamos puesto en nuestra API para conectarnos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/49.png)
