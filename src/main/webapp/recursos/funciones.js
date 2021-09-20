function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario" ){
        alert("Dame un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false; 
    }
    
    var password = forma.password;
    if(password.value == "" || password.value.length < 5){
        alert("Dame una contraseña de al menos 5 caracteres")
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false; 
    for (var i = 0; i < tecnologias.length ; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true; 
        }
    }
    if(!checkSeleccionado){
        alert("Selecciona por lo menos una tecnolgía");
        return false; 
    }
    
    var generos = forma.genero;
    var radSeleccionado = false; 
     for (var i = 0; i < generos.length ; i++){
        if(generos[i].checked){
            radSeleccionado = true; 
        }
    }
    if(!radSeleccionado){
        alert("Selecciona por lo menos un genero");
        return false; 
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Selecciona al menos una ocupacion");
        return false; 
    }
    
    //Formulario listo para envio
    alert("Formulario valido, enviando a servidor");
    return true; 
}

