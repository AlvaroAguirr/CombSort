# CombSort

el algoritmo de ordenamiento comb sort es un metodo basado en el bubble sort 
la diferencia de este algoritmo es que existe una brecha de comparación mas alta 
el algoritmo shellsort tambien contiene una brecha pero el combsort el factor de reduccion es de 1.3 
la primera brecha se el tamaño del arreglo dividido por 1.3 
posteriormente este valor obteneido sera dismiyundo por cada iterada que haga


# procedimiento 

una ves que tengas un arreglo
se tiene que conseguir el balor de brecha, este valor hace referencia a la distancia con la que se 
va ir comparando los numeros.
para conseguir este valor de brecha se va divide el largo del arreglo por una constante de 1.3 
el valor optenido sera la brecha que se utilizara para recorreger y acomodar el arreglo

se recorrera el arreglo mediante un for que llegara hastata el largo del arreglo menos el valor de la brecha
despues mediente un if se hara el acomodación del arreglo comparando la posision I y el valor que se utiliza con la breca 
if(arr[i] > arr[i+dis])
despues se hace el acomodo 
y mediante una varia cambios hara que el siglo se siga repitiendo porque desde un inicio se entra a un while
