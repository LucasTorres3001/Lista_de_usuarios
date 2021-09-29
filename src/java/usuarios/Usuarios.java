package usuarios;

import classe.acessorio.Acessoria;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import usuario.User;



public class Usuarios {
    
    DecimalFormat df = new DecimalFormat();
    
    List<User> users = new ArrayList();
    
    public String usuarios(){
        
        Random random = new Random();
        
        short anoAtual = (short) Calendar.getInstance().get(Calendar.YEAR);
        String msg = "";
        
        int anoI = random.nextInt(100) + (anoAtual - 100);
        int ano2 = random.nextInt(100) + (anoAtual - 100);
        int ano3 = random.nextInt(100) + (anoAtual - 100);
        int ano4 = random.nextInt(100) + (anoAtual - 100);
        float alt = 1.99f;
        double m = random.nextDouble() * 155;
        float alt2 = 1.74f;
        double m2 = random.nextDouble() * 100;
        float alt3 = 1.88f;
        double m3 = random.nextDouble() * 140;
        float alt4 = 1.72f;
        double m4 = random.nextDouble() * 95;
        
        users.add(new User("Thomaz Torres", "fevereiro", "Osasco", "SP", "Masculino", "Branco(a)", "55.890.010 - 3", "001.509.590 - 05", "thom_torres@gmail.com", "(11) 91010-4321", (byte) 13 , Acessoria.idade(anoAtual, anoI), anoI, alt, m, Acessoria.imc(m, alt)));
        users.add(new User("Vitória Villanova", "abril", "São José do Rio Preto", "SP", "Feminino", "Caboclo(a)", "55.123.321 - 3", "901.110.055 - 05", "vi_villanova@gmail.com", "(17) 90001-4820", (byte) 14 , Acessoria.idade(anoAtual, ano2), ano2, alt2, m2, Acessoria.imc(m2, alt2)));
        users.add(new User("Emmanuel Esteves", "janeiro", "Bertioga", "SP", "Masculino", "Caiçara", "55.987.211 - 3", "991.050.666 - 05", "emmanuel_esteves@gmail.com", "(13) 98055-0369", (byte) 31, Acessoria.idade(anoAtual, ano3), ano3, alt3, m3, Acessoria.imc(m3, alt3)));
        users.add(new User("Gabriela Guerra", "julho", "São Caetano do Sul", "SP", "Feminino", "Branco(a)", "55.484.676 - 3", "081.441.049 - 05", "gabi_guerra@gmail.com", "(11) 99361-8081", (byte) 30, Acessoria.idade(anoAtual, ano4), ano4, alt4, m4, Acessoria.imc(m4, alt4)));
        
        for(User user : users){
            
            msg += "<br/>";
            msg += "<table>";
            msg += "    <th colspan='2'>" + user.getNome() + "</th>";
            msg += "    <tr>";
            msg += "        <th>Data de nascimento</th>";
            msg += "        <td>" + user.getDia() + " de " + user.getMes() + " de " + user.getAnoNasc() + " (" + user.getIdade() + " anos)</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Local de nascimento</th>";
            msg += "        <td>" + user.getCidade() + " - " + user.getUf() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Genero</th>";
            msg += "        <td>" + user.getGenero() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Etnia</th>";
            msg += "        <td>" + user.getEtnia() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>R.G.</th>";
            msg += "        <td>" + user.getRg() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>C.P.F.</th>";
            msg += "        <td>" + user.getCpf() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>E-mail</th>";
            msg += "        <td>" + user.getEmail() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Telefone</th>";
            msg += "        <td>" + user.getTelefone() + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Altura</th>";
            msg += "        <td>" + user.getAltura() + " m</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>Massa</th>";
            msg += "        <td>" + df.format(user.getMassa()) + " kg</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <th>I.M.C.</th>";
            msg += "        <td>" + df.format(user.getImc()) + " kg/m<sup>2</sup></td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <td colspan='2'>" + Acessoria.statusIdade(user.getIdade()) + "</td>";
            msg += "    </tr>";
            msg += "    <tr>";
            msg += "        <td colspan='2'>" + Acessoria.statusIMC(user.getImc()) + "</td>";
            msg += "    </tr>";
            msg += "</table>";
            msg += "<br/>";
        }
        
        return msg;
    }
}
