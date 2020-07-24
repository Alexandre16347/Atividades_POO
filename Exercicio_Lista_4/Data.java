package Exercicio_Lista_4;

import java.util.Calendar;

public class Data {

	Calendar data;
	
	@Override
	public String toString() {
		return data.get(Calendar.DAY_OF_MONTH)+"/"+data.get(Calendar.MONTH);
	}
	
	public Calendar getData() {
		return data;
	}

	public void setData(String data) {
		String[] datas = data.split("/");
		int[] diaMes = new int[2];
		diaMes[0] = Integer.valueOf(datas[0]);
		diaMes[1] = Integer.valueOf(datas[1]);
		this.data = Calendar.getInstance();
		this.data.set(Calendar.DAY_OF_MONTH, diaMes[0]);
		this.data.set(Calendar.MONTH, diaMes[0]);
	}

	public Data(String data) {
		setData(data);
	}

}
