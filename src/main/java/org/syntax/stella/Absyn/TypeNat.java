// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class TypeNat  extends Type {
  public int line_num, col_num, offset;
  public TypeNat() { }

  public <R,A> R accept(org.syntax.stella.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.TypeNat) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
