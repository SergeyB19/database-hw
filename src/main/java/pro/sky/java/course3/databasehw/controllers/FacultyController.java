package pro.sky.java.course3.databasehw.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.databasehw.model.Faculty;
import pro.sky.java.course3.databasehw.service.FacultyService;

import java.util.Collection;

@RestController
@RequestMapping("Faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{id}")
    public ResponseEntity getFacultyInfo(@RequestParam String name,
                                         @RequestParam String color) {
        if (name == null&&!name.isBlank()) {
            return ResponseEntity.ok(facultyService.findFaculty(name, color));
        }
        return ResponseEntity.ok(facultyService.getAllFaculty());
    }

    @GetMapping
    public ResponseEntity<Collection<Faculty>> getAllFaculty() {
        return ResponseEntity.ok(facultyService.getAllFaculty());
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        facultyService.createFaculty(faculty);
        return faculty;
    }

    @PutMapping
    public ResponseEntity<Faculty> editFaculty(@RequestBody Faculty faculty) {
        Faculty foundFaculty = facultyService.editFaculty(faculty);
        if (foundFaculty == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFaculty);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

}
