package TestEntidades;

import java.util.Date;
import java.util.List;

import DaoImp.ProveedorImp;
import modelo.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) {
		
		ProveedorImp proimp = new ProveedorImp();
		TblProveedorcl2 prove = new TblProveedorcl2();
		
		Date fecha = new Date();
		Date fecha1 = new Date(fecha.getTime());
		
		
		//REGISTRAR
		/*prove.setNomproveecl2("Carlos");
		prove.setRucproveecl2("555555554");
		prove.setRsocialproveecl2("lomas");
		prove.setEmailproveecl2("lucas@gmail.com");
		prove.setFeingproveecl2(fecha1);
		
		proimp.RegistrarProveedor(prove);
		
		System.out.println("Proveedor Registrado"); */
		
		
		//ACTUALIZAR
		/*
		prove.setIdprooveedorcl2(1);
		prove.setNomproveecl2("Bruce");
		prove.setRucproveecl2("555555554");
		prove.setRsocialproveecl2("lomas");
		prove.setEmailproveecl2("lucas@gmail.com");
		prove.setFeingproveecl2(fecha1);
		
		proimp.ActualizarProveedor(prove);
		
		System.out.println("Proveedor Actualizado"); */
		
		//ELIMINAR
		/*
		prove.setIdprooveedorcl2(1);
		proimp.EliminarProveedor(prove);
		System.out.println("Proveedor Eliminado");*/
		
		//LISTADO
		/*
		List<TblProveedorcl2> listado = proimp.ListarProveedor();
		for(TblProveedorcl2 lis:listado){
			System.out.println("Codigo: "+lis.getIdprooveedorcl2()+ " Nombre: " +lis.getNomproveecl2()+ " Ruc: "+lis.getRucproveecl2()+ " Razón Social: " +lis.getRsocialproveecl2()+ " Email: "+lis.getEmailproveecl2()+ "Fecha Ingreso: "+lis.getFeingproveecl2());
		}
		*/
		
		//BUSCAR POR CODIGO
		/*
		prove.setIdprooveedorcl2(2);
		TblProveedorcl2 buscarprove = proimp.BuscarProveedor(prove);
		System.out.println("Codigo: "+buscarprove.getIdprooveedorcl2()+ " Nombre: " +buscarprove.getNomproveecl2()+ " Ruc: "+buscarprove.getRucproveecl2()+ " Razón Social: " +buscarprove.getRsocialproveecl2()+ " Email: "+buscarprove.getEmailproveecl2()+ "Fecha Ingreso: "+buscarprove.getFeingproveecl2());
		*/
		

	}

}
