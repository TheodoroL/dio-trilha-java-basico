public class Comentarios {
    public static void main(String[] args) {
        //Olá, eu sou um comentário :)
        /*
         * Olá, tudo bem com você?
         * eu sou um comentário um pouco mais robusto :)
         * acho que deu para ver isso né ? ^-^
         * */
        metodo("Ola mundo");
    }

    /**
     * Olá, tudo bem com você ?
     * eu sou um "comentário" focado em documentação :)
     * você não acredita ?
     * então toma:
     *
     * @param texto isso daqui é uma string
     ***/
    public static void metodo(String texto) {
        System.out.println(texto);
    }

}
