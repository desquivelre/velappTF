package pe.edu.upc.velapp.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;



@Controller
public class CalculoController {
	

	
	// PARA TASA NOMINAL
	
	public static double DescuentoParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal){
		
		double perTasaNominal=perTasaNominalConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEA = Math.pow(1+(perTasaNominal)/(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/NumDiasPeriodoCapitalizacion)-1;
		
		double TEcantidaddias=(Math.pow(1+TEA,CantidadDias/360))-1;
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = Math.round(ValorNominal*dperc) ;
	
	    return Descuento;
	  }
	
	public static double ValorNetoParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal){
		
		double perTasaNominal=perTasaNominalConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEA = Math.pow(1+(perTasaNominal)/(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/NumDiasPeriodoCapitalizacion)-1;
		
		double TEcantidaddias=(Math.pow(1+TEA,CantidadDias/360))-1;
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
		
		double ValorNeto = Math.round(ValorNominal - Descuento);
	
	    return ValorNeto;
	  }
	
	public static double ValorEntregadoParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		double perTasaNominal=perTasaNominalConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEA = Math.pow(1+(perTasaNominal)/(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/NumDiasPeriodoCapitalizacion)-1;
		
		double TEcantidaddias=(Math.pow(1+TEA,CantidadDias/360))-1;
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
		
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = Math.round(ValorNeto+GastoFinalTotal-Retencion);
		
	    return ValorEntregado;
	  }

	
	public static double ValorRecibidoParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		
		
		double perTasaNominal=perTasaNominalConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEA = Math.pow(1+(perTasaNominal)/(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/NumDiasPeriodoCapitalizacion)-1;
		
		double TEcantidaddias=(Math.pow(1+TEA,CantidadDias/360))-1;
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
		
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = ValorNeto+GastoFinalTotal-Retencion;
		
		double ValorRecibido = Math.round(ValorNeto-GastoInicialTotal-Retencion);
		
		
	    return ValorRecibido;
	  }
	
	public static double TCEAParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		double perTasaNominal=perTasaNominalConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEA = Math.pow(1+(perTasaNominal)/(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/NumDiasPeriodoCapitalizacion)-1;
		
		double TEcantidaddias=(Math.pow(1+TEA,CantidadDias/360))-1;
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
		
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = ValorNeto+GastoFinalTotal-Retencion;
		
		double ValorRecibido = ValorNeto-GastoInicialTotal-Retencion;
		
		double TCEA = Math.pow(ValorEntregado/ValorRecibido,360/CantidadDias)-1;
		
	    return TCEA;
	  }
	
	// PARA TASA EFECTIVA
	
	public static double DescuentoParaTasaEfectiva(Float perTasaEfectivaConPorcentaje, int NumDiasTasa, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal){
		
		double perTasaEfectiva=perTasaEfectivaConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEcantidaddias=(Math.pow(1+perTasaEfectiva,CantidadDias/NumDiasTasa))-1;
		
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = Math.round(ValorNominal*dperc) ;
	
	    return Descuento;
	  }
	
	
	public static double ValorNetoParaTasaEfectiva(Float perTasaEfectivaConPorcentaje, int NumDiasTasa, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal){
		
		double perTasaEfectiva=perTasaEfectivaConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEcantidaddias=(Math.pow(1+perTasaEfectiva,CantidadDias/NumDiasTasa))-1;
		
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
	
		double ValorNeto = Math.round(ValorNominal - Descuento);
		
	    return ValorNeto;
	  }
	
	public static double ValorEntregadoParaTasaEfectiva(Float perTasaEfectivaConPorcentaje, int NumDiasTasa, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		double perTasaEfectiva=perTasaEfectivaConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEcantidaddias=(Math.pow(1+perTasaEfectiva,CantidadDias/NumDiasTasa))-1;
		
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
	
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = Math.round(ValorNeto+GastoFinalTotal-Retencion);
		
	    return ValorEntregado;
	  }
	
	
	
	public static double ValorRecibidoParaTasaEfectiva(Float perTasaEfectivaConPorcentaje, int NumDiasTasa, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		double perTasaEfectiva=perTasaEfectivaConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEcantidaddias=(Math.pow(1+perTasaEfectiva,CantidadDias/NumDiasTasa))-1;
		
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
	
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = ValorNeto+GastoFinalTotal-Retencion;
		
		double ValorRecibido = Math.round(ValorNeto-GastoInicialTotal-Retencion);
		
	    return ValorRecibido;
	  }
	
	public static double TCEAParaTasaEfectiva(Float perTasaEfectivaConPorcentaje, int NumDiasTasa, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal, float Retencion){
		
		double perTasaEfectiva=perTasaEfectivaConPorcentaje/100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		float CantidadDias=(float)CantidadDiasLong;
		
		double TEcantidaddias=(Math.pow(1+perTasaEfectiva,CantidadDias/NumDiasTasa))-1;
		
		double dperc = TEcantidaddias/(TEcantidaddias+1);
		
		double Descuento = ValorNominal*dperc;
	
		double ValorNeto = ValorNominal - Descuento;
		
		double ValorEntregado = ValorNeto+GastoFinalTotal-Retencion;
		
		double ValorRecibido = ValorNeto-GastoInicialTotal-Retencion;
		
		double TCEA = Math.pow(ValorEntregado/ValorRecibido,360/CantidadDias)-1;
		
	    return TCEA;
	  }
	
	
	
}
