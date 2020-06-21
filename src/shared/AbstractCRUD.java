package shared;

import java.util.List;

<<<<<<< HEAD
public interface AbstractCRUD<T> {
	T create(T t);

	T read(Integer id);

	T update(T t);

	void delete(Integer id);

	List<T> readAll();
}
=======
public interface AbstractCRUD <T>{
	
	public T create(T t);
	
	public T read(int id);
	
	public List<T> readAll();
	
	public void update(T t);
	
	public void delete(int id);
}
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
