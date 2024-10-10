package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import modelo.TblUsuariocl2;

public class UsuarioImp implements IUsuario{

	public void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tblUsuariocl2);
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			ex.getMessage();
		}finally{
			em.close();
		}
	}

	public void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(tblUsuariocl2);
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			ex.getMessage();
		}finally{
			em.close();
		}
		
	}

	public void EliminarUsuario(TblUsuariocl2 tblUsuariocl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TblUsuariocl2 usuelim = em.find(TblUsuariocl2.class, tblUsuariocl2.getIdusuariocl2());
			if(usuelim!=null){
			em.remove(usuelim);
			em.getTransaction().commit();
			}
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			ex.getMessage();
		}finally{
			em.close();
		}
		
	}

	public List<TblUsuariocl2> ListarUsuario() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		List<TblUsuariocl2> listado = null;
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select p from TblUsuariocl2 p", TblUsuariocl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			ex.getMessage();
		}finally {
			em.close();
		}
		return listado;
	}

	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examencl2");
		EntityManager em = emf.createEntityManager();
		TblUsuariocl2 buscausu = null;
		
		try {
			em.getTransaction().begin();
			buscausu = em.find(TblUsuariocl2.class, tblUsuariocl2.getIdusuariocl2());
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			ex.getMessage();
		}finally{
			em.close();
		}
		return buscausu;
		
		
	}

}
