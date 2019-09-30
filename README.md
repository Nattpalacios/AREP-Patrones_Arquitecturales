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

Ahora vamos a aprender a desplegar un recurso dinámico en el servicio EC2 de AWS haciendo uso de una base de datos también creada en AWS. Para poder hacer esto, es importante que tengamos una cuenta en AWS o AWS Educate. Antes de empezar, ingresamos a nuestra cuenta de AWS o AWS Educate y abrimos la consola.

1.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/1.png)

2.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/2.png)

3.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/3.png)

4.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/4.png)

5.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/5.png)

6.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/6.png)

7.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/7.png)

8.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/8.png)

9.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/9.png)

10.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/10.png)

11.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/11.png)

12.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/12.png)

13.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/13.png)

14.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/14.png)

15.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/15.png)

16.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/16.png)

17.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/17.png)

18.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/18.png)

19.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/19.png)

20.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/20.png)

21.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/21.png)

22.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/22.png)

23.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/23.png)

24.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/24.png)

25.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/25.png)

26.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/26.png)

27.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/27.png)

28.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/28.png)

29.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/29.png)

30.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/30.png)

31.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/31.png)

32.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/32.png)

33.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/33.png)

34.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/34.png)

35.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/35.png)

36.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/36.png)

37.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/37.png)

38.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/38.png)

39.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/39.png)

40.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/40.png)

41.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/41.png)

42.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/42.png)

43.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/43.png)

44.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/44.png)

45.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/45.png)

46.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/46.png)

47.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/47.png)

48.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/48.png)

49.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/49.png)
