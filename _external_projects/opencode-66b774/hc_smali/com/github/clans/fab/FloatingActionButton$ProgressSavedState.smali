.class public Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;
.super Landroid/view/View$BaseSavedState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProgressSavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:F

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public おぐぴう〸ず:Z

.field public くし〴〺ぅ:F

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Z

.field public びぐびあび:F

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState$げつ〴ぬぐ;

    invoke-direct {v0}, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〺つふすそ:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->くし〴〺ぅ:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_19

    const/4 p2, 0x1

    goto :goto_1a

    :cond_19
    const/4 p2, 0x0

    :goto_1a
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぺぁあねじ:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->びぐびあび:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->づざかべべ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->なぎぱいぢぎ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〳ぜぞぜべっ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_42

    const/4 p2, 0x1

    goto :goto_43

    :cond_42
    const/4 p2, 0x0

    :goto_43
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->いいにぽつ:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_4d

    const/4 p2, 0x1

    goto :goto_4e

    :cond_4d
    const/4 p2, 0x0

    :goto_4e
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぺふねづ〺:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_58

    const/4 p2, 0x1

    goto :goto_59

    :cond_58
    const/4 p2, 0x0

    :goto_59
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->てぜきぽく:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_63

    const/4 p2, 0x1

    goto :goto_64

    :cond_63
    const/4 p2, 0x0

    :goto_64
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->のぷのちつ:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_6e

    const/4 p2, 0x1

    goto :goto_6f

    :cond_6e
    const/4 p2, 0x0

    :goto_6f
    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->へぬ〴づぞ:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_78

    const/4 v0, 0x1

    :cond_78
    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->おぐぴう〸ず:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〺つふすそ:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->くし〴〺ぅ:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぺぁあねじ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->びぐびあび:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->づざかべべ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->なぎぱいぢぎ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぁごぐすすぃ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〳ぜぞぜべっ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->いいにぽつ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぺふねづ〺:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->てぜきぽく:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->のぷのちつ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->へぬ〴づぞ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->おぐぴう〸ず:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
