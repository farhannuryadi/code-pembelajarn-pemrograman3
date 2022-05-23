package com.company;

public class pertemuan3c1 {
    public static void main(String[] args) {
        int abc[][]=new int[2][2];
            abc[0][0]=1;
            abc[0][1]=2;
            abc[1][0]=3;
            abc[1][1]=4;

        int i,j;
        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                System.out.print(abc[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        String data[][]={   {"123","Diana","Jakarta"},
                            {"234","sari","Bandung"},
                            {"456","Riani","Semarang"}
                        };

        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
