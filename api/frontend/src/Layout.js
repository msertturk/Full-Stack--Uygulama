import { Outlet, Link } from "react-router-dom";
import { Navbar, Nav } from "react-bootstrap";

const Layout = () => {
  return (
    <>
      <Navbar bg="dark" variant="dark">
        <Navbar.Brand as={Link} to="/">My App</Navbar.Brand>
        <Nav className="mr-auto">
          <Nav.Link as={Link} to="/">Home</Nav.Link>
          <Nav.Link as={Link} to="/lectures">Lectures</Nav.Link>
        </Nav>
      </Navbar>
      <div className="container mt-3">
        <Outlet />
      </div>
      <footer className="text-center mt-4">
        <p>© 2024 My App. All Rights Reserved.</p>
      </footer>
    </>
  );
};

export default Layout;


