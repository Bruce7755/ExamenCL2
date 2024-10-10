package Interfaces;

import java.util.List;

import modelo.TblProveedorcl2;

public interface IProveedor {
	void RegistrarProveedor(TblProveedorcl2 tblProveedorcl2);
	void ActualizarProveedor(TblProveedorcl2 tblProveedorcl2);
	void EliminarProveedor(TblProveedorcl2 tblProveedorcl2);
	List<TblProveedorcl2> ListarProveedor();
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblProveedorcl2);

}
