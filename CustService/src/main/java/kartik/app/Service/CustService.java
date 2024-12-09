package kartik.app.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kartik.app.Entity.Customer;
import kartik.app.Exception.ResourceNotFoundException;
import kartik.app.Repository.CustRepo;

@Service
public class CustService implements CustServiceInterface{

	
	@Autowired
	private CustRepo custRepo;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		String iUuid = UUID.randomUUID().toString();
		customer.setCustId(iUuid);
		return custRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(String id) {
		return custRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found With Id : "+id));
	}

	@Override
	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}

}
