package com.sgcharts.log

import System.nanoTime

package object scala {

  /**
    * Based on https://stackoverflow.com/a/14574121/519951
    * @param code code block to run
    * @param t start time
    * @tparam R return type of code block
    * @return 2-item tuple: result of code block and time elapsed in nanoseconds
    */
  def timed[R](code: => R, t: Long = nanoTime): (R, Long) = (code, nanoTime - t)
}
