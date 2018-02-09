package br.com.vodibarco.models;

public class Estado
{
   private int id;
   private String estado;
   private String siglaEstado;

   public Estado(int id, String estado, String siglaEstado)
   {
      this.id = id;
      this.estado = estado;
      this.siglaEstado = siglaEstado;
   }

   public Estado(String estado, String siglaEstado)
   {
      this.estado = estado;
      this.siglaEstado = siglaEstado;
   }


   public int getId()
   {
      return id;
   }


   public String getEstado()
   {
      return estado;
   }


   public String getSiglaEstado()
   {
      return siglaEstado;
   }
}
