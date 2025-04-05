public class MinhaClasse {
  public static void main (String[] args) {
    System.out.println( "Olá tudo bem com você? Seja Bem-vindo! Ao Sistema de ensino" );
    String primeiroNome = "Gabriel";
    String segundoNome = "Martins";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    int idade = 26;
    int ano = 2025;
    boolean ativoAtualmente = true;
    System.out.println(nomeCompleto + " que está cadastrado no " + ano +  " e tem " + idade + " anos, está ativo atualmente? " + ativoAtualmente);
  }
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do sistema: " + primeiroNome.concat( " ").concat(segundoNome);
  }

}
