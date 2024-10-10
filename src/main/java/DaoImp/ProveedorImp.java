package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import modelo.TblProveedorcl2;

public class ProveedorImp implements IProveedor{

	public void RegistrarProveedor(TblProveedorcl2 tblProveedorcl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tblProveedorcl2);
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			ex.getMessage();
		}finally {
			em.close();
		}
		
	}

	public void ActualizarProveedor(TblProveedorcl2 tblProveedorcl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(tblProveedorcl2);
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			ex.getMessage();
		}finally {
			em.close();
		}
		
	}

	public void EliminarProveedor(TblProveedorcl2 tblProveedorcl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			TblProveedorcl2 proveelim = em.find(TblProveedorcl2.class, tblProveedorcl2.getIdprooveedorcl2());
			
			if(proveelim!=null){
			em.remove(proveelim);
			em.getTransaction().commit();
			}
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			ex.getMessage();
		}finally {
			em.close();
		}
		
	}

	public List<TblProveedorcl2> ListarProveedor() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		List<TblProveedorcl2> listado = null;
		try {
			em.getTransaction().begin();
			
			listado = em.createQuery("select p from TblProveedorcl2 p", TblProveedorcl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			ex.getMessage();
		}finally{
			em.close();
		}
		return listado;
	}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblProveedorcl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		TblProveedorcl2 buscaprove = null;
		try {
			em.getTransaction().begin();
			buscaprove = em.find(TblProveedorcl2.class, tblProveedorcl2.getIdprooveedorcl2());
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			ex.getMessage();
		}finally{
			em.close();
		}
		return buscaprove;
	}

}
