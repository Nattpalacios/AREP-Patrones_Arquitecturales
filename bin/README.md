# Patrones Arquitecturales

## Autor

Natalia Faride Palacios Rozo

## Desplegar un sitio estático usando S3

Vamos a aprender a desplegar un sitio estático usando S3 en AWS en unos pasos muy sencillos.

1. Lo primero que haremos es abrir la consola de AWS.
2. Seleccionamos S3 en la sección ‘Storage’.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/1.png)

3. Le damos clic en Crear bucket.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/2.png)

4. Le asignamos un nombre al bucket, en este caso yo le pondré ‘nattbucket’. Damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/3.png)

5. En este paso no es necesario hacer algo, sencillamente le damos en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/4.png)

6. Desactivamos esa opción para poder dar acceso público y damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/5.png)

7. Damos clic en Crear bucket.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/6.png)

8. Una vez creado el bucket debe aparecernos algo así:
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/7.png)

9. Entramos al bucket que creamos dando clic sobre él y damos clic en Upload para subir nuestro archivo estático, en este caso yo subiré un archivo de tipo html.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/8.png)

10. Damos clic en 'Add Files' y seleccionamos nuestro archivo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/9.png)

11. Una vez seleccionado el archivo que queremos subir, damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/10.png)

12. En este paso no debemos cambiar nada, solo damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/11.png)

13. Lo dejamos con ese y damos clic en Next.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/12.png)

14. Damos clic en Upload para cargar el archivo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/13.png)

15. Una vez subido el archivo, debe aparecernos algo así. Damos clic sobre él para poder verlo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/14.png)

16. Damos clic en el link donde se desplegó.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/15.png)

17. Es posible que nos aparezca esto, así que nos devolvemos a donde estábamos.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/16.png)

18. Vamos a la pestaña 'Permissions' y en Public access seleccionamos Everyone.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/17.png)

19. Nos debe aparecer este recuadro y habilitamos Read Object para que al abrir el enlace nos muestre nuestro archivo. Damos clic en Save. Una vez hecho esto, volvemos a la pestaña Overview y volvemos a abrir el enlace. Ya debería funcionar. Eso es todo.
![](https://raw.githubusercontent.com/Nattpalacios/AREP-Patrones_Arquitecturales/master/Imagenes/18.png)

## Videos

Para ver los videos de los tutoriales:
- https://github.com/Nattpalacios/AREP-Patrones_Arquitecturales/blob/master/Videos/S3-Archivo%20estatico.mp4
- 
