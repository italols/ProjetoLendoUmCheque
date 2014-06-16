package main

/**
 * Created by Italo on 13/06/2014.
 */
class LendoCheque {


    public double converteValor(String valorPorExtenso){

        valorPorExtenso.replace(',' , ' ')
        String [] valor = valorPorExtenso.split(" ")
        int un1 = 0, un2 = 0, un3 = 0, un4 = 0
        int de1 = 0, de2 = 0, de3 = 0, de4 = 0
        int ce1 = 0, ce2 = 0, ce3 = 0, ce4 = 0

        double total = 0

        for (int i = 0; i < valor.length; i++) {
            switch (valor[i]) {
                case "um":
                    un1 = 1
                    break

                case "dois":
                    un1 = 2
                    break

                case "tres":
                    un1 = 3
                    break

                case "quatro":
                    un1 = 4
                    break

                case "cinco":
                    un1 = 5
                    break

                case "seis":
                    un1 = 6
                    break

                case "sete":
                    un1 = 7
                    break

                case "oito":
                    un1 = 8
                    break

                case "nove":
                    un1 = 9
                    break

                case "dez":
                    un1 = 0
                    de1 = 1
                    break

                case "onze":
                    un1 = 1
                    de1 = 1
                    break

                case "doze":
                    un1 = 2
                    de1 = 1
                    break

                case "treze":
                    un1 = 3
                    de1 = 1
                    break

                case "quatorze":
                    un1 = 4
                    de1 = 1
                    break

                case "quinze":
                    un1 = 5
                    de1 = 1
                    break

                case "dezesseis":
                    un1 = 6
                    de1 = 1
                    break

                case "dezessete":
                    un1 = 7
                    de1 = 1
                    break

                case "dezoito":
                    un1 = 8
                    de1 = 1
                    break

                case "dezenove":
                    un1 = 9
                    de1 = 1
                    break

                case "vinte":
                    un1 = 0
                    de1 = 2
                    break

                case "trinta":
                    un1 = 0
                    de1 = 3
                    break

                case "quarenta":
                    un1 = 0
                    de1 = 4
                    break

                case "cinquenta":
                    un1 = 0
                    de1 = 5
                    break

                case "sessenta":
                    un1 = 0
                    de1 = 6
                    break

                case "setenta":
                    un1 = 0
                    de1 = 7
                    break

                case "oitenta":
                    un1 = 0
                    de1 = 8
                    break

                case "noventa":
                    un1 = 0
                    de1 = 9
                    break

                case "cem":
                    un1 = 0
                    de1 = 0
                    ce1 = 1
                    break

                case "cento":
                    un1 = 0
                    de1 = 0
                    ce1 = 1
                    break

                case "duzentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 2
                    break

                case "trezentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 3
                    break

                case "quatrocentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 4
                    break

                case "quinhentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 5
                    break

                case "seiscentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 6
                    break;

                case "setecentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 7
                    break;

                case "oitocentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 8
                    break

                case "novecentos":
                    un1 = 0
                    de1 = 0
                    ce1 = 9
                    break

                case "mil":
                    un2 = un1
                    de2 = de1
                    ce2 = ce1
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "milhao":
                    un3 = un1
                    de3 = de1
                    ce3 = ce1
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "milhoes":
                    un3 = un1
                    de3 = de1
                    ce3 = ce1
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "bilhao":
                    un4 = un1
                    de4 = de1
                    ce4 = ce1
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "bilhoes":
                    un4 = un1
                    de4 = de1
                    ce4 = ce1
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "real":
                    total = ce4* 100000000000L + de4 * 10000000000L + un4 * 1000000000 + ce3* 100000000 + de3 * 10000000 + un3 * 1000000 + ce2* 100000 + de2 * 10000 + un2 * 1000 + ce1* 100 + de1 * 10 + un1
                    un4 = 0
                    de4 = 0
                    ce4 = 0
                    un3 = 0
                    de3 = 0
                    ce3 = 0
                    un2 = 0
                    de2 = 0
                    ce2 = 0
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "reais":
                    total = ce4* 100000000000L + de4 * 10000000000L + un4 * 1000000000 + ce3* 100000000 + de3 * 10000000 + un3 * 1000000 + ce2* 100000 + de2 * 10000 + un2 * 1000 + ce1* 100 + de1 * 10 + un1
                    un4 = 0
                    de4 = 0
                    ce4 = 0
                    un3 = 0
                    de3 = 0
                    ce3 = 0
                    un2 = 0
                    de2 = 0
                    ce2 = 0
                    un1 = 0
                    de1 = 0
                    ce1 = 0
                    break

                case "centavo":
                    total = total + de1 * 0.1 + un1 * 0.01

                    break

                case "centavos":
                    total = total + de1 * 0.1 + un1 * 0.01

                    break
            }
        }

        total

    }

}
