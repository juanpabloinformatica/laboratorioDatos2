package lab1datos2;

import java.util.ArrayList;

public class Usuario {
    
    private ArrayList<Post> posts;
    private ArrayList<Comentario> comentarios;
//    
//    private Usuario hIzq;
//    private Usuario hDer;
    
    private int userId;
    private String name;
    private String userName;
    private String email;
    private String phone;
    private String website;
    private Adress adress;
    private Company company;

    public Usuario() {
        posts = new ArrayList();
        comentarios = new ArrayList();
        
    }
    
    
}