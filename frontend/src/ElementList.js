import React, { useEffect, useState } from "react";
import './ElementTable.css';

function ElementList() {
	const [elements, setElements] = useState([]);
	const [searchQuery, setSearchQuery] = useState("");

	useEffect(() => {
		fetch("http://localhost:8080/allElements")
			.then((res) => res.json())
			.then((data) => setElements(data));
	}, []);

	const filteredElements = elements.filter((e) =>
		e.name.toLowerCase().includes(searchQuery.toLowerCase())
	);

	return (
		<div>
			{/* Title Block */}
			<div className="element-block-title">
				<div className="atomic-number">118</div>
				<div className="symbol">El</div>
				<div className="element-name">Elements</div>
			</div>

			{/* Search Bar */}
			<div className="search-container">
				<input
					type="text"
					placeholder="Search by element name"
					value={searchQuery}
					onChange={(e) => setSearchQuery(e.target.value)}
				/>
			</div>

			{/* Table */}
			<table border="1" cellPadding="5" cellSpacing="0">
				<thead>
					<tr>
						<th>Atomic Number</th>
						<th>Symbol</th>
						<th>Name</th>
						<th>Appearance</th>
						<th>Atomic Mass</th>
						<th>Category</th>
						<th>Density</th>
						<th>Discovered By</th>
						<th>Period</th>
						<th>Group</th>
						<th>Bohr Model Image</th>
						<th>Summary</th>
						<th>Shells</th>
					</tr>
				</thead>
				<tbody>
					{filteredElements.map((e) => (
						<tr key={e.number}>
							<td>{e.number}</td>
							<td>{e.symbol}</td>
							<td>{e.name}</td>
							<td>{e.appearance}</td>
							<td>{e.atomic_mass}</td>
							<td>{e.category}</td>
							<td>{e.density}</td>
							<td>{e.discovered_by}</td>
							<td>{e.period}</td>
							<td>{e.group}</td>
							<td>
								{e.bohr_model_image ? (
									<img
										src={e.bohr_model_image}
										alt={`Bohr model of ${e.name}`}
										style={{ width: '100px', height: 'auto' }}
									/>
								) : (
									"No image"
								)}
							</td>
							<td>{e.summary}</td>
							<td>{e.shells.join(", ")}</td>
						</tr>
					))}
				</tbody>
			</table>
		</div>
	);
}

export default ElementList;
