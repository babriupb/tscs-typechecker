package de.upb.cs.swt.tscs.typed.numexpr

import de.upb.cs.swt.tscs.Value

/**
  * Represents numeric values in the N-language
  */
case class NumericValueExpr(v : String) extends Value(v) with TypedNumericExpression