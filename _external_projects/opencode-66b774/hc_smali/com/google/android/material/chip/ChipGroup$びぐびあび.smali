.class public Lcom/google/android/material/chip/ChipGroup$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/chip/ChipGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

.field public final synthetic くし〴〺ぅ:Lcom/google/android/material/chip/ChipGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/ChipGroup;Lcom/google/android/material/chip/ChipGroup$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->くし〴〺ぅ:Lcom/google/android/material/chip/ChipGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->くし〴〺ぅ:Lcom/google/android/material/chip/ChipGroup;

    if-ne p1, v0, :cond_2b

    instance-of v0, p2, Lcom/google/android/material/chip/Chip;

    if-eqz v0, :cond_2b

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_21

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1a

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    goto :goto_1e

    :cond_1a
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1e
    invoke-virtual {p2, v0}, Landroid/view/View;->setId(I)V

    :cond_21
    move-object v0, p2

    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget-object v1, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->くし〴〺ぅ:Lcom/google/android/material/chip/ChipGroup;

    .line 1
    iget-object v1, v1, Lcom/google/android/material/chip/ChipGroup;->ぺふねづ〺:Lcom/google/android/material/chip/ChipGroup$〺つふすそ;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->setOnCheckedChangeListenerInternal(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_2b
    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->〺つふすそ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_32

    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    :cond_32
    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->くし〴〺ぅ:Lcom/google/android/material/chip/ChipGroup;

    if-ne p1, v0, :cond_f

    instance-of v0, p2, Lcom/google/android/material/chip/Chip;

    if-eqz v0, :cond_f

    move-object v0, p2

    check-cast v0, Lcom/google/android/material/chip/Chip;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->setOnCheckedChangeListenerInternal(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_f
    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$びぐびあび;->〺つふすそ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_16

    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    :cond_16
    return-void
.end method
