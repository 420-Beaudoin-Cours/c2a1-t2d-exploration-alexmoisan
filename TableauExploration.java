public class TableauExploration {

    public static void initTen(int[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++) {
            for (int j = 0; j < tab2d[0].length; j++)
                tab2d[i][j] = 10;
        }
    }

    public static void initDiagonaleTen(int[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++) {
            for (int j = 0; j < tab2d[0].length; j++)
                if (i == j)
                    tab2d[i][j] = 10;
        }
    }

    public static void initPosition(String[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++) {
            for (int j = 0; j < tab2d[0].length; j++)
                tab2d[i][j] = i + ":" + j;
        }

    }

    public static boolean isTabCarre(int[][] tab2d) {
        int nb_lignes = tab2d.length;
        int nb_colonnes = tab2d[0].length;
        boolean carre = false;

        if (nb_lignes == nb_colonnes)
            carre = true;

        return carre;
    }

    public static boolean isTabDimEgal(int[][] tab2d1, int[][] tab2d2) {
        int nb_ligne_tab1 = tab2d1.length;
        int nb_lignes_tab2 = tab2d2.length;
        int nb_col_tab1 = tab2d1[0].length;
        int nb_col_tab2 = tab2d2[0].length;
        boolean egal = false;

        if (nb_ligne_tab1 == nb_lignes_tab2 && nb_col_tab1 == nb_col_tab2)
            egal = true;

        return egal;
    }

    public static int[][] getSommeMatrices(int[][] tab2d1, int[][] tab2d2) {
        int[][] matrice = tab2d1;

        for (int i = 0; i < tab2d2.length; i++){
            for (int j = 0; j < tab2d2[0].length; j++)
                matrice[i][j] += tab2d2[i][j];
        }

        return matrice;
    }

}
