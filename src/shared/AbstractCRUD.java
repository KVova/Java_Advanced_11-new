package shared;

import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
public interface AbstractCRUD<T> {
	T create(T t);

	T read(Integer id);

	T update(T t);

	void delete(Integer id);

	List<T> readAll();
}
=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
public interface AbstractCRUD <T>{
	
	public T create(T t);
	
	public T read(int id);
	
	public List<T> readAll();
	
	public void update(T t);
	
	public void delete(int id);
<<<<<<< HEAD
}
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
}
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
