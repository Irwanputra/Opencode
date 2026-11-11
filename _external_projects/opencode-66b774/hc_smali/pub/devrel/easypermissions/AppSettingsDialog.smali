.class public Lpub/devrel/easypermissions/AppSettingsDialog;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpub/devrel/easypermissions/AppSettingsDialog;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final 〳ぜぞぜべっ:I

.field public final 〺つふすそ:I

.field public final ぁごぐすすぃ:I

.field public final くし〴〺ぅ:Ljava/lang/String;

.field public final づざかべべ:Ljava/lang/String;

.field public final なぎぱいぢぎ:Ljava/lang/String;

.field public final びぐびあび:Ljava/lang/String;

.field public ぺぁあねじ:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lpub/devrel/easypermissions/AppSettingsDialog$げつ〴ぬぐ;

    invoke-direct {v0}, Lpub/devrel/easypermissions/AppSettingsDialog$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lpub/devrel/easypermissions/AppSettingsDialog;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Lpub/devrel/easypermissions/AppSettingsDialog$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->びぐびあび:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->づざかべべ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->〳ぜぞぜべっ:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    iget p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->〺つふすそ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->びぐびあび:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->づざかべべ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->ぁごぐすすぃ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lpub/devrel/easypermissions/AppSettingsDialog;->〳ぜぞぜべっ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
