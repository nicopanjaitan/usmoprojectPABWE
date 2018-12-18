package usmoPABWE.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table (name="registrator")
public class Registrator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name="nama_registrator")
	private String nama;
	private String jenisKelamin;
	private String place;
	private String tanggal;
	private String agama;
	private String address;	
	private Integer nohp;
	private String email;
	private String unggahfoto;
	
	private String namaAyah;
	private String jobAyah;
	private Integer penghasilanAyah;
	private String namaIbu;
	private String jobIbu;
	private Integer penghasilanIbu;
	
	private String school;
	private String alamatSekolah;
	private String jurusan;
	private String prodi1;
	private String prodi2;
	private String jenisUjian;
	private String lokasi;
	private Integer uangPengembangan;
	private String status;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	public String getAgama() {
		return agama;
	}
	public void setAgama(String agama) {
		this.agama = agama;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getNohp() {
		return nohp;
	}
	public void setNohp(Integer nohp) {
		this.nohp = nohp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUnggahfoto() {
		return unggahfoto;
	}
	public void setUnggahfoto(String unggahfoto) {
		this.unggahfoto = unggahfoto;
	}
	public String getNamaAyah() {
		return namaAyah;
	}
	public void setNamaAyah(String namaAyah) {
		this.namaAyah = namaAyah;
	}
	public String getJobAyah() {
		return jobAyah;
	}
	public void setJobAyah(String jobAyah) {
		this.jobAyah = jobAyah;
	}
	public Integer getPenghasilanAyah() {
		return penghasilanAyah;
	}
	public void setPenghasilanAyah(Integer penghasilanAyah) {
		this.penghasilanAyah = penghasilanAyah;
	}
	public String getNamaIbu() {
		return namaIbu;
	}
	public void setNamaIbu(String namaIbu) {
		this.namaIbu = namaIbu;
	}
	public String getJobIbu() {
		return jobIbu;
	}
	public void setJobIbu(String jobIbu) {
		this.jobIbu = jobIbu;
	}
	public Integer getPenghasilanIbu() {
		return penghasilanIbu;
	}
	public void setPenghasilanIbu(Integer penghasilanIbu) {
		this.penghasilanIbu = penghasilanIbu;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAlamatSekolah() {
		return alamatSekolah;
	}
	public void setAlamatSekolah(String alamatSekolah) {
		this.alamatSekolah = alamatSekolah;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getProdi1() {
		return prodi1;
	}
	public void setProdi1(String prodi1) {
		this.prodi1 = prodi1;
	}
	public String getProdi2() {
		return prodi2;
	}
	public void setProdi2(String prodi2) {
		this.prodi2 = prodi2;
	}
	public String getJenisUjian() {
		return jenisUjian;
	}
	public void setJenisUjian(String jenisUjian) {
		this.jenisUjian = jenisUjian;
	}
	public String getLokasi() {
		return lokasi;
	}
	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
	public Integer getUangPengembangan() {
		return uangPengembangan;
	}
	public void setUangPengembangan(Integer uangPengembangan) {
		this.uangPengembangan = uangPengembangan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}