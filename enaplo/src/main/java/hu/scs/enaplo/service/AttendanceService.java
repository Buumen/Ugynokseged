package hu.scs.enaplo.service;

import java.time.LocalDate;
import java.util.List;

import hu.scs.enaplo.dto.AttendanceDTO;
import hu.scs.enaplo.dto.response.AttendanceResponseDTO;
import hu.scs.enaplo.model.Attendance;

/**
 * This interface contains all related function definitions to the attendance.
 */
public interface AttendanceService {

    /**
     * Returns a form that contains a list of students
     * and boolean field for each student.
     *
     * @param classroom_id Id of the classroom.
     * @return A form table to collect the missing students.
     */
    List<AttendanceDTO> makeAttendanceFormToClassroom(Long classroom_id);

    /**
     * Creates new attendances for the missing students.
     *
     * @param attendanceResponseDTOS Submitted DTOs from web application.
     * @return List of Attendances.
     * @see Attendance
     */
    List<Attendance> create(List<AttendanceResponseDTO> attendanceResponseDTOS);

    /**
     * Deletes an attendances by id.
     *
     * @param id Id of the Attendance.
     */
    void delete(Long id);

    /**
     * Verifies a missed lecture by id.
     *
     * @param id Id of the Attendance.
     */
    void verify(Long id);

    /**
     * Returns a List of non verified attendances by classroom.
     *
     * @param classroom_id Id of the Classroom.
     * @return a list of attendances.
     */
    List<Attendance> getAllAttendancesByClassroom(Long classroom_id);

    /**
     * Returns a List of Attendances by student id.
     *
     * @param student_id Id of the Student.
     * @return a list of the attendances.
     */
    List<Attendance> getAllByStudent(Long student_id);
}
