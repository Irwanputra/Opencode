.class public Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;
.super Landroid/view/View$BaseSavedState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:[I

.field public びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState$げつ〴ぬぐ;

    invoke-direct {v0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-lez p2, :cond_16

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->くし〴〺ぅ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->びぐびあび:I

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

    iget p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->〺つふすそ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->くし〴〺ぅ:[I

    if-eqz p2, :cond_16

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->くし〴〺ぅ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    goto :goto_1a

    :cond_16
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1a
    iget p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->びぐびあび:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
