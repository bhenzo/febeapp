import { Button, Card } from 'react-bootstrap';

const ProductListView = ({ text }) => {
	return (
		<Card>
			<Card.Img />
			<Card.Body>
                
                <Card.Text>
                {text}
                </Card.Text>
                <div className="d-grid gap-1">
                    <Button variant="primary">Borrar</Button>
                </div>
                </Card.Body>
		</Card>
	);
};

export default ProductListView;
