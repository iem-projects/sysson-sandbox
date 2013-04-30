package at.iem.sysson

import de.sciss.osc.Implicits._
import java.net.InetSocketAddress

package object sandbox {
  val supercollider: InetSocketAddress = localhost -> 57120
  val chuck        : InetSocketAddress = localhost ->  6449
}
