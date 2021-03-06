// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// C++ from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


#ifndef OI_H
#define OI_H

#include <WPILib.h>
#include "ToggledPressedButtonScheduler.h"

class OI {
private:
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	std::shared_ptr<Joystick> stick;

	std::shared_ptr<JoystickButton> gearDown;
	std::shared_ptr<JoystickButton> gearUp;
	std::shared_ptr<JoystickButton> lift;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	std::shared_ptr<JoystickButton> shiftButton;
	std::shared_ptr<JoystickButton> gearGrabButton;
	std::shared_ptr<JoystickButton> gearReleaseButton;
	std::shared_ptr<ToggledPressedButtonScheduler> shiftToggle;
	std::shared_ptr<ToggledPressedButtonScheduler> gearGrabToggle;

	std::shared_ptr<XboxController> controller;
public:
	OI();

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PROTOTYPES

	std::shared_ptr<Joystick> getstick();
	std::shared_ptr<JoystickButton> getButton();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PROTOTYPES
};

#endif
