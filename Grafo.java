public class Grafo {
//22310397 Rostro Diaz Jesus Ignacio 
//Demotrar comprension sobre el funcionamiento de la matriz adyacente por medio de 
//arreglos, en este caso 5 ejemplos de arreglos bidimensionales.    
    public static void main (String args[]){
        int[][] mady1 = new int[4][4];
        int[][] mady2 = new int[3][3];
        int[][] mady3 = new int[3][3];
        int[][] mady4 = new int[3][3];
        int[][] mady5 = new int[4][4];
//Ejemplo 1. Grafo 1. 22310397
        // Row 1 Col 1
        mady1[0][0] = 1;
        mady1[0][1] = 1;
        mady1[0][2] = 0;
        mady1[0][3] = 0;
// Row 2 Col 2
        mady1[1][0] = 1;
        mady1[1][1] = 0;
        mady1[1][2] = 0;
        mady1[1][3] = 1;
// Row 3 Col 3
        mady1[2][0] = 0;
        mady1[2][1] = 0;
        mady1[2][2] = 0;
        mady1[2][3] = 1;
// Row 4 Col 4
        mady1[3][0] = 0;
        mady1[3][1] = 1;
        mady1[3][2] = 1;
        mady1[3][3] = 0;



        System.out.println("Primer matriz adyacente");
        for(int i = 0; i < mady1.length; i++){
            for(int j=0; j<mady1[i].length;j++){
                System.out.print(" |"+mady1[i][j]+"|");
            }
            System.out.print("\n");
        }

// Ejemplo 2. Grafo 2. 22310397
//Row 1 col 1
        mady2[0][0] = 1;
        mady2[0][1] = 0;
        mady2[0][2] = 0;
//Row 2 col 2
        mady2[1][0] = 0;
        mady2[1][1] = 1;
        mady2[1][2] = 0;
//Row 3 col 3
        mady2[2][0] = 0;
        mady2[2][1] = 0;
        mady2[2][2] = 1;

        System.out.println("Segunda matriz adyacente");
        for(int i = 0; i < mady2.length; i++){
            for(int j=0; j<mady2[i].length;j++){
                System.out.print(" |"+mady2[i][j]+"|");
            }
            System.out.print("\n");
        }
// Ejemplo 3. Grafo 3. 22310397
//Row 1 col 1
mady3[0][0] = 1;
mady3[0][1] = 1;
mady3[0][2] = 1;
//Row 2 col 2
mady3[1][0] = 1;
mady3[1][1] = 1;
mady3[1][2] = 0;
//Row 3 col 3
mady3[2][0] = 1;
mady3[2][1] = 0;
mady3[2][2] = 0;

System.out.println("Tercera matriz adyacente");
for(int i = 0; i < mady3.length; i++){
    for(int j=0; j<mady3[i].length;j++){
        System.out.print(" |"+mady3[i][j]+"|");
    }
    System.out.print("\n");
}
// Ejemplo 4. Grafo 4. 22310397
//Row 1 col 1
mady4[0][0] = 1;
mady4[0][1] = 1;
mady4[0][2] = 0;
//Row 2 col 2
mady4[1][0] = 1;
mady4[1][1] = 0;
mady4[1][2] = 1;
//Row 3 col 3
mady4[2][0] = 0;
mady4[2][1] = 1;
mady4[2][2] = 0;

System.out.println("Cuarta matriz adyacente");
for(int i = 0; i < mady4.length; i++){
    for(int j=0; j<mady4[i].length;j++){
        System.out.print(" |"+mady4[i][j]+"|");
    }
    System.out.print("\n");
}

//Ejemplo 5. Grafo 5. 22310397
// Row 1 Col 1
        mady5[0][0] = 0;
        mady5[0][1] = 0;
        mady5[0][2] = 1;
        mady5[0][3] = 1;
// Row 2 Col 2
        mady5[1][0] = 0;
        mady5[1][1] = 1;
        mady5[1][2] = 1;
        mady5[1][3] = 0;
// Row 3 Col 3
        mady5[2][0] = 1;
        mady5[2][1] = 1;
        mady5[2][2] = 1;
        mady5[2][3] = 0;
// Row 4 Col 4
        mady5[3][0] = 1;
        mady5[3][1] = 0;
        mady5[3][2] = 0;
        mady5[3][3] = 1;

        System.out.println("Quinta matriz adyacente");
        for(int i = 0; i < mady5.length; i++){
            for(int j=0; j<mady5[i].length;j++){
                System.out.print(" |"+mady5[i][j]+"|");
            }
            System.out.print("\n");
        }



    }
    
    
}
