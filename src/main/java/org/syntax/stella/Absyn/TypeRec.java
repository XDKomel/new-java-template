// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class TypeRec  extends Type {
  public final String stellaident_;
  public final Type type_;
  public int line_num, col_num, offset;
  public TypeRec(String p1, Type p2) { stellaident_ = p1; type_ = p2; }

  public <R,A> R accept(org.syntax.stella.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.TypeRec) {
      org.syntax.stella.Absyn.TypeRec x = (org.syntax.stella.Absyn.TypeRec)o;
      return this.stellaident_.equals(x.stellaident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.stellaident_.hashCode())+this.type_.hashCode();
  }


}
