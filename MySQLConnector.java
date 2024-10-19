import java.sql.*;

public class MySQLConnector {
    public static Connection conectar() {// n eh void pq retorna um objeto do tipo  connection
        String mysqlHost = ("127.0.0.1");//variável utilizada para conexão. endereço do servidor
        String mysqlDb = "db_senac";
        String mysqlUser = "root";
        String mysqlPassword = "senac@02";
        String mysqlPort = "3306";//porta padrão mundial
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        //jdbc:mysql:// (protocolo), ? (diferenciador de login e senha), user (nome da variavel get dentro da url do mysql),
        Connection conn = null;
        try {//coleta o erro do sistema 
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
        } catch (Exception e) {
            System.err.println("Ops! Algo deu errado não está certo com a conexãocom o banco de dadso MySQL! Mensagem do servidor: " +e);
        }
        return conn;
    } 
}
