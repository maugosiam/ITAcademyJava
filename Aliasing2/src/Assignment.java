public class Assignment {
    public static void main(String[] args) {
        Tank tank1 = new Tank(11, 'a');
        Tank tank2 = new Tank('d');

        tank2.level = 22;

        System.out.println(tank1.literaAlfabetu + " " + tank1.level);
        System.out.println(tank2.literaAlfabetu + " " + tank2.level);

        ZmianaReferencji zmianaReferencji = new ZmianaReferencji();
        tank1 = zmianaReferencji.metodaZmianaReferencji(tank2);

        System.out.println("\n" + tank1.literaAlfabetu + " " + tank1.level);
        System.out.println(tank2.literaAlfabetu + " " + tank2.level);

        tank2.level = 145;
        tank1.literaAlfabetu = 'x';

        System.out.println("\n" + tank1.literaAlfabetu + " " + tank1.level);
        System.out.println(tank2.literaAlfabetu + " " + tank2.level);

    }


}
