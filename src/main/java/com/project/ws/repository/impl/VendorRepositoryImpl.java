
package com.project.ws.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.project.ws.domain.Vendor;
import com.project.ws.repository.custom.VendorCustomRepository;

public class VendorRepositoryImpl implements VendorCustomRepository {

		/**
		 * This EntityManager attribute is used to create the database queries
		 */
		@PersistenceContext
		private EntityManager em;

		public void setEntityManager(EntityManager em) {
			this.em = em;
		}

		@Override
		@Transactional
		public Integer addVendor(Vendor vendor) {
			//insert data in order_details
			String SQL = "INSERT INTO vendor (vendor_name, vendor_addr_line1, vendor_addr_line2, vendor_city, vendor_state, vendor_zip_code, vendor_country) VALUES('" +
						vendor.getVendorName() + "', '" + vendor.getVendorAddrLine1() + "', '" + vendor.getVendorAddrLine2() + "', '" +
						vendor.getVendorCity() + "', '" + vendor.getVendorState() + "', '" + vendor.getVendorZipCode() + "', '" + vendor.getVendorCountry() + "')";

			Integer count = em.createNativeQuery(SQL).executeUpdate();
			if (count == 1)
				System.out.println("vendor added successfully");
			else
				System.out.println("ERROR!!! Check logs/database");
			return count;
		}

		@Override
		@Transactional
		public Integer updateStatus(Integer vendorId, String flag) {
			String SQL = "update vendor set active_flag = '" + flag + "' where vendor_id = " + vendorId;
			Integer count = em.createNativeQuery(SQL).executeUpdate();
			if (count == 1)
				System.out.println("Vendor made inactive");
			else
				System.out.println("ERROR!!! Check logs/database");
			return count;
		}
		
		@Override
		@Transactional
		public Integer updatePayment(Integer vendorId, Double amount) {
			String SQL = "update vendor set amount_paid = '" + amount + "' where vendor_id = " + vendorId;
			System.out.println(SQL);
			Integer count = em.createNativeQuery(SQL).executeUpdate();
			if (count == 1)
				System.out.println("Amount Settled");
			else
				System.out.println("ERROR!!! Check logs/database");
			return count;
		}

		@Override
		@Transactional
		public Integer updateAddress(Vendor vendor) {
			String SQL = "update vendor set vendor_addrline1 = '" + vendor.getVendorAddrLine1() + "', vendor_addrline2 = '" +
						vendor.getVendorAddrLine2() + "', vendor_city = '" + vendor.getVendorCity() + "', vendor_state = '" +
						vendor.getVendorState() + "', vendor_zip_code = '" + vendor.getVendorZipCode() + "' where vendor_id = " +
						vendor.getVendorId();
			Integer count = em.createNativeQuery(SQL).executeUpdate();
			if (count == 1)
				System.out.println("vendor address updated successfully");
			else
				System.out.println("ERROR!!! Check logs/database");
			return count;
		}

		@Override
		@Transactional
		public Integer updateVendorName(Integer vendorId, String name) {
			String SQL = "update vendor set vendor_name = '" + name + "' where vendor_id = " + vendorId;
			Integer count = em.createNativeQuery(SQL).executeUpdate();
			return count;
		}


		@Override
		@Transactional
		public Integer deleteVendor(Integer vendorId) {
			String SQL = "DELETE from vendor where vendor_id = " + vendorId ;
			Integer count = em.createNativeQuery(SQL).executeUpdate();
			if (count == 1)
				System.out.println("DELETE successfully");
			else
				System.out.println("ERROR!!! Check logs/database");
			return count;
		}


}
