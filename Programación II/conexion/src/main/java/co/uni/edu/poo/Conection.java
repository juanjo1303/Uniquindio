package co.uni.edu.poo;

public class Conection {
    private String user;
    private String pass;
    private String host;
    private String codification;
    private short await;
    private byte attempts;
    private boolean ssl;
    private short port;
    private String dataBase;
    
    public Conection(String user, String pass, String host, String codification, short await, byte attempts,
            boolean ssl, short port, String dataBase) {
        this.user = user;
        this.pass = pass;
        this.host = host;
        this.codification = codification;
        this.await = await;
        this.attempts = attempts;
        this.ssl = ssl;
        this.port = port;
        this.dataBase = dataBase;
    }

    private static Conection instance;

    private Conection(){
    }

    public static Conection getConection(){
        if (Conection.instance == null) {
            Conection.instance = new Conection();
        }
        return Conection.instance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCodification() {
        return codification;
    }

    public void setCodification(String codification) {
        this.codification = codification;
    }

    public short getAwait() {
        return await;
    }

    public void setAwait(short await) {
        this.await = await;
    }

    public byte getAttempts() {
        return attempts;
    }

    public void setAttempts(byte attempts) {
        this.attempts = attempts;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public static class ConectionBuilder {
        private String user;
        private String pass;
        private String host;
        private String codification;
        private short await;
        private byte attempts;
        private boolean ssl;
        private short port;
        private String dataBase;

        public ConectionBuilder(String user, String pass, String host) {
        }

        public ConectionBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ConectionBuilder pass(String pass) {
            this.pass = pass;
            return this;
        }

        public ConectionBuilder host(String host) {
            this.host = host;
            return this;
        }

        public ConectionBuilder codification(String codification) {
            this.codification = codification;
            return this;
        }

        public ConectionBuilder await(short await) {
            this.await = await;
            return this;
        }

        public ConectionBuilder attempts(byte attempts) {
            this.attempts = attempts;
            return this;
        }

        public ConectionBuilder ssl(boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public ConectionBuilder port(short port) {
            this.port = port;
            return this;
        }

        public ConectionBuilder dataBase(String dataBase) {
            this.dataBase = dataBase;
            return this;
        }

        public Conection build() {
            return new Conection(user, pass, host, codification, await, attempts, ssl, port, dataBase);       
        }
    }
}