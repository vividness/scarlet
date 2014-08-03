package org.scarlet

/**
 * Create a new class that extends the ScarletApp class.
 */
class DefaultApp extends ScarletApp {
  /**
   * This will register "GET /" route.
   * Every GET request to the "/" URI will be routed to this block.
   */
  get("/") {
    <h1 style="color: scarlet">Congratulations! You're running your first Scarlet app</h1>
  }
}