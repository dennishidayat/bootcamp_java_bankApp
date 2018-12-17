package com.sti.tryApps;
//
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.tryApps.dao.CustomerDao;
import com.sti.tryApps.model.Customer;
@RestController
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/hello")
	public String getById(@RequestParam (value="id", defaultValue="") int id) {
		try {
			Customer customer = customerDao.getById(id);
			if (customer==null) {
				return "Data not found";
			}else {
				return "hello "+customer.getFirstname();
			}
		} catch (NumberFormatException e) {
			return "Invalid input";
			// TODO: handle exception
		} catch (Exception e) {
			return String.format("Error occured!, Message : "+e.getMessage());
		}
	}
	
	@PostMapping("/insert")
	public Customer insert(@RequestBody Customer CustData) throws Exception {
		customerDao.save(CustData);
		return CustData;
	}
	
	@PutMapping("/edit")
	public Customer edit(@RequestBody Customer CustData) throws Exception{
		customerDao.save(CustData);
		return CustData;
	}

	@DeleteMapping("/delete")
	public Customer delete(@RequestBody Customer CustData) throws Exception {
	CustData.getCustomernumber();
	customerDao.delete(CustData);
	return CustData;
	}
	
	@GetMapping("/list")
	public List<Customer> getList(@RequestBody Customer CustData) throws Exception {
		try {
			List<Customer> list = customerDao.getList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping("/listById")
	public List<Customer> listById(@RequestParam(value="id", defaultValue="") int id) throws Exception {
		try {
			Customer customer = customerDao.getById(id);
			if (customer==null) {
				return null;
			}else {
				List<Customer> list = customerDao.getList();
				return list;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
//	@GetMapping("/addarray")
//	public List<Customer> GetList(){
//		Customer gd = new Customer();
//		gd.setCustNum(10);
//		gd.setUname("Dennis");
//		gd.setPwd("12345");
//		gd.setBday("14 oktober 1998");
//		gd.setName("Dennis");
//		gd.setLast("Hidayat");
//		gd.setPhoneType("ios");
//		gd.setMobileNum("085774762604");
//		ArrayList<Customer> list = new ArrayList();
//		list.add(gd);
//		
//		return list;
//	}
	
}