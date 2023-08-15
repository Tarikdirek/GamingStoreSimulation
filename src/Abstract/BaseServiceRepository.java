package Abstract;

public interface BaseServiceRepository<T> {
	void add(T entity);
	void delete(T entity);
	void update(T entity);
	
}
