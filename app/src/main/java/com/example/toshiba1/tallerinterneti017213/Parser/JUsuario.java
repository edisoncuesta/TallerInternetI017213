package com.example.toshiba1.tallerinterneti017213.Parser;

import com.example.toshiba1.tallerinterneti017213.Model.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOSHIBA1 on 20/04/2018.
 */

public class JUsuario {

    public static List<Usuario> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);

        List<Usuario> userList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            Usuario usuario = new Usuario();
            usuario.setCodigo(item.getString("codigo"));
            usuario.setNombre(item.getString("nombre"));
            usuario.setEdad(item.getString("edad"));
            usuario.setCorreo(item.getString("correo"));
            usuario.setPass(item.getString("pass"));

            userList.add(usuario);

        }

        return userList;
    }
}
