
import { Row, Col, Container, Stack } from 'react-bootstrap';
import ProductListView from '../components/ProductListView';


const MainPage = () => {

    const prods = [
        {
            name: "producto 1 sdjfhakhfdkjsdahfjk sad"
        },
        {
            name: "producto 2 ajhdsjksdahjkadhksadjsasd"
        }
    ]

    return (
        <Container>
            
            <Row>
                <Col xs={6}>
                    1
                </Col>
                <Col xs={6}>
                    <Stack gap={3}>
                        {
                            prods.map(p => <ProductListView text={p.name}/>)
                        }
                    </Stack>
                </Col>
            </Row>
        </Container>
    )
} 

export default MainPage;