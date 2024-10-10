package TestEntidades;

import java.util.List;

import DaoImp.UsuarioImp;
import modelo.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		UsuarioImp usuimp = new UsuarioImp();
		TblUsuariocl2 usu = new TblUsuariocl2();
		
		//REGISTRAR
		/*
		usu.setUsuariocl2("admin");
		usu.setPasswordcl2("1234");
		usuimp.RegistrarUsuario(usu);
		System.out.println("Usuario Registrado"); 
		*/
		
		//ACTUALIZAR
		/*
		usu.setIdusuariocl2(1);
		usu.setUsuariocl2("editor");
		usu.setPasswordcl2("1234");
		usuimp.ActualizarUsuario(usu);
		System.out.println("Usuario Actualizado"); */
		
		//ELIMINAR
		/*
		usu.setIdusuariocl2(1);
		usuimp.EliminarUsuario(usu);
		System.out.println("Usuario Eliminado");*/
		
		//LISTAR
		/*
		List<TblUsuariocl2> listado = usuimp.ListarUsuario();
		for(TblUsuariocl2 lis:listado){
			System.out.println(" Codigo: "+lis.getIdusuariocl2()+ " Usuario: "+lis.getUsuariocl2()+ " Contraseña: "+lis.getPasswordcl2());
		}
		*/
		
		//BUSCARPRODUCTO
		/*
		usu.setIdusuariocl2(3);
		TblUsuariocl2 buscarusu = usuimp.BuscarUsuario(usu);
		System.out.println(" Codigo: "+buscarusu.getIdusuariocl2()+ " Usuario: "+buscarusu.getUsuariocl2()+ " Contraseña: "+buscarusu.getPasswordcl2());
		*/

	}

}
